$(document).ready(function() {
	var elem_header_content = 
		[
			"РО 1",
			"РО 2",
			"РО 3",
			"РО 4",
			"РО 5",
			"РО 6",
			"РО 7",
			"РО 8",
			"ДО1",
			"ДО2",
			"ЗО",
			"Авария"
		];
	var lightStartEid = 11;
	var lightEndEid = 22;
	
	var common_content_block = $('#result');		
	$('#search').click(function()
	{
		var beforeIt = $('#bdate').val();
		var afterIt = $('#adate').val();
		var isDesc = $('#isDesc').is(':checked');
		var sbd = 
		{ 
			"beforeIt": beforeIt,
			"afterIt": afterIt,
			"isDesc": isDesc
		};
		$.ajax({
			type: "POST",
			contentType: "application/json;charset=utf-8",
			url: "getRecordsOfPeriod",
			data: JSON.stringify(sbd),
			timeout: 600000,
			success: function(actions) 
			{
				common_content_block.attr('lastDate', actions[0].created);
				var day_content0 = $('<div>')
					.addClass('day_content')
					.attr('part-date', (actions[0].created).substring(0,10))
					.appendTo(common_content_block);
				$('<span>')
					.addClass('date_header')
					.text((actions[0].created).substring(0,10))
					.appendTo(day_content0);
				for (var i = lightStartEid; i <= lightEndEid; i++)
				{
					
					$('<div>')
					.addClass('elem_header')
					.text(elem_header_content[i-11])
					.appendTo(day_content0);
					
					$('<div>')
						.addClass('elem')
						.attr('eid', i)
						.appendTo(day_content0);
				}
				
				$.each(actions, function(key,value)
				{
					var prevDate = new Date((common_content_block.attr('lastDate')).substring(0,10));
					var currDate = new Date((value.created).substring(0,10));
					var date_clear = (value.created).substring(0,10);
					
					
					
					if (!isEqual(prevDate, currDate)) 
					{
						var day_content = $('<div>')
							.addClass('day_content')
							.attr('part-date', date_clear)
							.appendTo(common_content_block);
						
						$('<span>')
							.addClass('date_header')
							.text(date_clear)
							.appendTo(day_content);
						
						for (var i = lightStartEid; i <= lightEndEid; i++)
						{
							$('<div>')
								.addClass('elem_header')
								.text(elem_header_content[i-11])
								.appendTo(day_content);
							$('<div>')
								.addClass('elem')
								.attr('eid', i)
								.appendTo(day_content);
						}
					}
					var action_column = $(".day_content[part-date='"+date_clear+"'] .elem[eid='"+(value.eid)+"']");
					var action_class = "action " + (value.state ? "action_1" : "action_0");
					$('<span>')
						.addClass(action_class)
						.text(value.created)
						.appendTo(action_column);
					common_content_block.attr('lastDate',value.created);
				});
								
			},
			error: function(e) 
			{
				console.log(e);
			}
		});
	});
	
	function isEqual(startDate, endDate) {
	    return endDate.valueOf() == startDate.valueOf();
	}
	
});


