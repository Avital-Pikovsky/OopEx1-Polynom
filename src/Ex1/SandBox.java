package Ex1;

import java.io.IOException;

import com.google.gson.Gson;

public class SandBox {

	public static void main(String[] args) {
		ComplexFunction cf1 = new ComplexFunction("div", new Polynom("x+1"), new Monom(3,4));
		function cf2 = cf1.initFromString("Mul(3x^5-4X,plus(x,7x))");
		Functions_GUI fgui = new Functions_GUI();
		fgui.add(cf1);
		fgui.add(cf2);
		
		try {
			fgui.saveToFile("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
