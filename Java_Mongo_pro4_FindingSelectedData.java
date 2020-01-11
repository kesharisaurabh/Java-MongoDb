package pk1;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class Java_Mongo_pro4_FindingSelectedData 
{
	public static void main(String[] args) 
	{
		MongoClient mongo=new MongoClient("localhost", 27017);
		System.out.println("Connection Established with MongoDb");
		
		DB db=mongo.getDB("Saurabh");
		System.out.println("mongoBatabased");
		
		DBCollection collection=db.getCollection("Keshari");
		System.out.println("Mongo Collection");
		
		BasicDBObject ob=new BasicDBObject("name","Varun");
		DBCursor cur=collection.find();
		cur=collection.find(ob);
		
		while(cur.hasNext())
		{
			System.out.println(cur.next());
		}
		
		
	}
}
