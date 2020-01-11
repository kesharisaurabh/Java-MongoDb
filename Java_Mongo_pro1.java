package pk1;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class Java_Mongo_pro1 
{
	@SuppressWarnings({ "deprecation", "resource" })
	public static void main(String[] args) throws Exception 
	{
		MongoClient mongo = new MongoClient("localhost",27017);
		System.out.println("Connection Established With NoSql DB");
		
		DB db=mongo.getDB("saurabh");
		System.out.println("Database Created");
		
		DBCollection collection=db.getCollection("Keshari");
		System.out.println("Collection Created");
		
		BasicDBObject bd=new BasicDBObject("name", "saurabh").append("addd", "near Block Office").append("PhoneNi", 999999);
		System.out.println("Basic Object Created");
		
		collection.insert(bd);
		System.out.println("object data inserted using Collection");
		
		System.out.println("Data Inserted Sucess");
   
	}
}
