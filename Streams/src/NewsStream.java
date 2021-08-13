import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class News
{
	int newsID;
	String postedByUser;
	String commentByUser;
	String comment;
	
	News(int newsID, String postedByUser, String commentByUser, String comment)
	{
		this.newsID=newsID;
		this.postedByUser=postedByUser;
		this.commentByUser=commentByUser;
		this.comment=comment;
	}
	
	public int getID()
	{
		return newsID;
	}
	
	public void setID(int newsID) 
	{
        this.newsID = newsID; 
    }
	
	public String getPost()
	{
		return postedByUser;
	}
	
	public void setPost(String postedByUser) 
	{
        this.postedByUser = postedByUser; 
    }
	
	public String getUserComment()
	{
		return commentByUser;
	}
	
	public void setUserComment(String commentByUser) 
	{
        this.commentByUser = commentByUser; 
    }
	
	public String getComment()
	{
		return comment;
	}
	
	public void setComment(String comment) 
	{
        this.comment = comment; 
    }
	
	@Override
	public String toString() {
	     return "News [News ID=" + newsID + ", Post By User=" + postedByUser + ", Comment By User=" + commentByUser +", Comment=" + comment + "]";
	}
}

public class NewsStream {

	public static void main(String[] args)
	{
		ArrayList<News> n=new ArrayList<News>();
		n.add(new News(1001, "Lakshmi","Comment:1","Budget is high"));
		n.add(new News(1002, "Sneha","Comment:1","Budget is balanced"));
		n.add(new News(1001, "Lakshmi","Comment:2","Budget is low"));
		n.add(new News(1002, "Sneha","Comment:2","Budget is high"));
		n.add(new News(1001, "Lakshmi","Comment:3","Budget is balanced"));
		n.add(new News(1003, "Raj","Comment:1","Budget is high"));
		n.add(new News(1003, "Pratik","Comment:3","Budget is low"));
		
		int l=0;
		for(News news:n)
		{
			if(news.getComment().length()>l)
			{
				l= news.getComment().length();
			}
		}
		
		System.out.println("IDs of User with maximum comments: ");
		for(News news:n)
		{
			if(news.getComment().length()==l)
			{
				System.out.println(news.getID());
			}
		}
		
		List<String> c= new ArrayList<String>();
		for(News news:n)
		{
			c.add(news.getPost());
		}
		String g = c.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().max((o1,o2)->o1.getValue().compareTo(o2.getValue()))
				.map(Map.Entry::getKey).orElse(null);
		
		System.out.println("The User which Maxinum Number of Comments");
		System.out.println(g);
		
		Long count= n.stream().filter(b->b.getComment().contains("Budget")).count();
		
		System.out.println("The number of times Budget appear in comments : "+count);
	}
}
