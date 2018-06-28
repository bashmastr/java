
interface Plugin{

	public  void draw();
	public  void save();
}

class TextEditorPlugin implements Plugin{

	

	public void draw(){

		System.out.println("Drawing.text");
	}
	public void save(){
		System.out.println("save.text");
	}

}

class PDFViewerPlugin implements Plugin{

	public void draw(){

		System.out.println("showing PDF");
	}

	public void save(){
		System.out.println("save PDF");
	}

}


class Runner09{

	public static void main(String args[]){

		// TextEditorPlugin t = new TextEditorPlugin();

		// t.draw();
		// t.save();

		// PDFViewerPlugin pdf = new PDFViewerPlugin();
		// pdf.draw();
		// pdf.save();

		Plugin p = new TextEditorPlugin();
		p.draw();
		p.save();

		p = new PDFViewerPlugin();
		p.draw();
		p.save();

	}
}