package bookatuthar;
public class Book{
	   private int book_id;
	   private String title;
	   private author author;
	   private float price;
	   


	   public Book()
	   {
	    book_id =0;
	    title="NA";
	    price = 0;
	   }

	   public Book(int book_id, String title, int id, String name, String city, float price)
	   {
	    this.book_id = book_id;
	    this.title = title;
	    this.author=new author(id,name,city);
	    this.price = price;
	   }

	   
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCity() {
		return author.getCity();
	}
	
	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", title=" + title + ", " + author + ", price=" + price + "]";
	}
	   
	   
		 
	   }


