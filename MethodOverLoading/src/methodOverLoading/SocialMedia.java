package methodOverLoading;

public class SocialMedia {
	public void post(String text)
	{
		System.out.println("Posted:"+text);
	}
	public void post(String text,String image)
	{
		System.out.println("Posted: "+text+ " with "+image);
	}
	public void post(String text,String Image,String Video)
	{
		System.out.println("Posted: "+text+ " with "+Image+ " with "+Video);
	}
	public static void main(String[] args)
	{
		SocialMedia s=new SocialMedia();
		s.post("Hi Karthik");
		s.post("Hi karthik", "Ongole Images");
		s.post("Hi karthik", "Ongole Images", "Ongole Videos");
	}
}
