package example1;


import example1.Book.Chapter;

public class MainClass {

	//Book application
	//A book has chapters, pages, cover page, comment page
	
	public static void main(String[] args) {
		
		Book book = new Book();
		
		Chapter chapter1 = book. new Chapter(1,"Introduction");
		Chapter chapter2 = new Book(). new Chapter(2,"More info");
		
		book.addChapter(chapter1);
		book.addChapter(chapter2);
		
		Writer writer = new MainClass.Writer();
		
		
		book.addPage(new ContentPage());
		
		//Anonymous inner class
		book.addPage(new Page() {
			
			@Override
			public String getContent() {
				return "Page 1";
			}
			
			
		});
		
		//Anonymous inner class
		book.addPage(new Page() {
			
			@Override
			public String getContent() {
				// TODO Auto-generated method stub
				return "Page 2";
			}
		});
		
		//Anonymous inner class
		book.addPage(new Page() {
			
			@Override
			public String getContent() {
				// TODO Auto-generated method stub
				return "Page 3";
			}
		});
		
		//lambda expression
		// when we need to implement a FUNCTIONAL interface
		// then instead of using anpnymous inner classes, we can implement
		//the interface using a lambda expression
		book.addPage(()-> "Page 6");
		
		
		for (Page pg : book.getPages()) {
			System.out.println(pg.getContent());
		}
		
	}
	
	public static void test() {}
	
	static class Writer{
		private String name;
		
		public void write() {
			test();
		}
	}
	
}
