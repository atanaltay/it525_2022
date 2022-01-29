package example1;

import java.util.ArrayList;
import java.util.List;

public class Book {

	private List<Chapter> chapters  = new ArrayList<Chapter>();
	private Page  coverPage;
	
	private List<Page> pages = new ArrayList<Page>();
	
	
	
	public void addPage(Page page) {
		this.pages.add(page);
	}
	
	public void addChapter(Chapter chapter) {
		chapters.add(chapter);
	}
	
	//local inner classes: classes defined in methods
	public void setCoverPage() {
		
		
		class CoverPage implements Page{
			private String title;
			private String backgroundColor;
			
			public CoverPage() {
				// TODO Auto-generated constructor stub
			}

			public CoverPage(String title, String backgroundColor) {
				super();
				this.title = title;
				this.backgroundColor = backgroundColor;
			}
			
			public String getTitle() {
				return title;
			}
			
			public void setTitle(String title) {
				this.title = title;
			}

			@Override
			public String getContent() {
				return "Cover page: title:" +  title + " : back color:" + backgroundColor;  
			}
			
		}
		
		
		CoverPage cover = new CoverPage("Book name", "yellow");
		
		this.coverPage = cover;
		
	
	}
	
	public List<Page> getPages() {
		return pages;
	}
	
	public Page getCoverPage() {
		return coverPage;
	}
	

	//JavaBean: Classes with default constructors and all fields encapsulated
	//Member inner class
	class Chapter{
		private int no;
		private String title;
		
		public Chapter() {
			 
		}

		public Chapter(int no, String title) {
			super();
			this.no = no;
			this.title = title;
		}
		
		public int getNo() {
			return no;
		}
		public String getTitle() {
			return title;
		}
		
	}
	
	
}
