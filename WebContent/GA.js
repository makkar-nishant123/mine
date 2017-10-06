function generate_actions() {
	var list_events = [ "--Select--", "Mouse", "KeyBoard", "Browser", "Others" ];
	var select = [ "--Select--" ];

	var arr = [];
	var arr1 = [];

	var a = parseInt(document.getElementById("count_actions").value);
	if (a != null) {
		arr.length = a;
		arr1.length = a;
		var add_attr = [];
		add_attr.length = arr.length;

		var add_attr1 = [];
		add_attr1.length = arr.length;
		action_form = document.createElement('FORM');
		action_form.name = 'action_form';
		action_form.id = 'action_form';

		action_form.method = 'POST';

	}
	var div_ch = document.getElementById("div_ch");
	div_ch.innerHTML = "";
	div_ch.appendChild(document.createTextNode('EVENTS'));
	div_ch.appendChild(document.createTextNode('SUB-EVENTS'));
	div_ch.appendChild(document.createTextNode('WEB-ELEMENT'));
	div_ch.appendChild(document.createTextNode('DURATION'));

	for ( var j = 0; j < a; j++) {

		my_tb1 = document.createElement("select");
		my_tb2 = document.createElement("select");
		my_tb3 = document.createElement('INPUT');
		my_tb4 = document.createElement('INPUT');

		my_tb1.name = "1" + j;
		my_tb2.name = "2" + j;
		my_tb3.name = "3" + j;
		my_tb4.name = "4" + j;
		my_tb1.id = "1" + j;
		my_tb2.id = "2" + j;
		my_tb3.id = "3" + j;
		my_tb4.id = "4" + j;
		arr[j] = "1" + j;
		arr1[j] = "2" + j;

		action_form.appendChild(my_tb1);
		action_form.appendChild(document.createTextNode(" "));
		action_form.appendChild(my_tb2);
		action_form.appendChild(document.createTextNode(" "));
		action_form.appendChild(my_tb3);
		action_form.appendChild(document.createTextNode(" "));
		action_form.appendChild(my_tb4);
		action_form.appendChild(document.createTextNode(" "));
		action_form.appendChild(document.createElement("br"));

		div_ch.appendChild(action_form);
		for ( var i = 0; i < list_events.length; i++) {
			var option = document.createElement("option");
			option.value = list_events[i];
			option.text = list_events[i];
			my_tb1.appendChild(option);
		}

		var option = document.createElement("option");
		option.value = select[0];
		option.text = select[0];
		my_tb2.appendChild(option);

	}

	for ( var i = 0; i < arr.length; i++) {

		add_attr[i] = document.getElementById(arr[i])
		add_attr1[i] = document.getElementById(arr1[i])
		add_attr[i].addEventListener('change', function() {

			id2 = parseInt(this.id) + 10;
			process_data(this.id, id2);
		}, false);

	}

	var formData1 = JSON.stringify($("#action_form").serializeArray());

}

function process_data(data, data2) {
	var Mouse = [ "--Select--", "Click", "DodubleClick", "Hover" ];
	var KeyBoard = [ "--Select--", "Type" ];
	var Browser = [ "--Select--", "GotoURL", "Refresh", "Close" ];

	ele = document.getElementById(data)
	ele1 = document.getElementById(data2)

	var size = ele1.length;
	for ( var l = 0; l < size; l++) {
		ele1.remove(0);
	}

	switch (ele.value) {
	case "Mouse": {
		for ( var k = 0; k < Mouse.length; k++) {
			var option = document.createElement("option");
			option.value = Mouse[k];
			option.text = Mouse[k];
			ele1.appendChild(option);
		}
	}
	break;
	case "KeyBoard": {
		for ( var k = 0; k < KeyBoard.length; k++) {
			var option = document.createElement("option");
			option.value = KeyBoard[k];
			option.text = KeyBoard[k];
			ele1.appendChild(option);
		}
	}
	break;
	case "Browser": {
		for ( var k = 0; k < Browser.length; k++) {
			var option = document.createElement("option");
			option.value = Browser[k];
			option.text = Browser[k];
			ele1.appendChild(option);
		}
	}
	break;
	default:
		console.log("Not a valid Entry")
	}
}

function generate_text_box(data) {
	var div_ch1 = document.getElementById('div_ch1');
	if (data == 'Code' || data == 'Both') {

		while (div_ch1.hasChildNodes()) {
			div_ch1.removeChild(div_ch1.lastChild);
		}

		

		in1 = document.createElement('INPUT');
		in2 = document.createElement('INPUT');

		in1.name = "class_name";
		in1.id = "class_name";

		in2.name = "method_name";
		in2.id = "method_name";

		div_ch1.appendChild(document.createTextNode('Class Path'));
		div_ch1.appendChild(in1);
		div_ch1.appendChild( document.createTextNode( '\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0' ) );
		div_ch1.appendChild(document.createTextNode('Method Name'));
		div_ch1.appendChild(in2);
		//div_ch1.appendChild(ac_form);

	} else {
		while (div_ch1.hasChildNodes()) {
			div_ch1.removeChild(div_ch1.lastChild);
		}
	}
}