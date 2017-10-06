package selenium_utils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import utils.Servlet_helper;

public class Windows {

	private String method_code;
	private Point point;
	private Dimension dimension;

	public Windows(String method_code, Point point) {
		// TODO Auto-generated method stub
		this.method_code = method_code;
		this.point = point;
	}

	public Windows(String method_code, Dimension dimension) {
		// TODO Auto-generated method stub
		this.method_code = method_code;
		this.dimension = dimension;
	}

	public Point get_point() {
		return point;
	}

	public String get_method_code() {
		return method_code;
	}

	public Dimension get_dimension() {
		return dimension;
	}

	public static String maximize_window(int flag) {
		if (flag == 0 || flag == 2)
			Servlet_helper.getdriver().manage().window().maximize();

		return "Servlet_helper.getdriver().manage().window().maximize();";
	}

	public static String fullscreen_window(int flag) {
		if (flag == 0 || flag == 2)
			Servlet_helper.getdriver().manage().window().fullscreen();

		return "Servlet_helper.getdriver().manage().window().fullscreen();";
	}

	public static String setSize_window(Dimension dimension, int flag) {
		if (flag == 0 || flag == 2)
			Servlet_helper.getdriver().manage().window().setSize(dimension);

		return "Servlet_helper.getdriver().manage().window().setSize(" + dimension + ");";
	}

	public static String setPosition_window(Point point, int flag) {
		if (flag == 0 || flag == 2)
			Servlet_helper.getdriver().manage().window().setPosition(point);

		return "Servlet_helper.getdriver().manage().window().setPosition(" + point + ");";
	}

	public static Windows getPosition_window(int flag) {
		Point point = null;
		if (flag == 0 || flag == 2)
			point = Servlet_helper.getdriver().manage().window().getPosition();

		String method_code = "Servlet_helper.getdriver().manage().window().getPosition();";
		return new Windows(method_code, point);
	}

	public static Windows getSize_window(int flag) {
		Dimension dimension = null;
		if (flag == 0 || flag == 2)
			dimension = Servlet_helper.getdriver().manage().window().getSize();

		String method_code = "Servlet_helper.getdriver().manage().window().getSize();";
		return new Windows(method_code, dimension);
	}

}
