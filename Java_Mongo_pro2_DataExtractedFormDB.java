package pk1;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class Java_Mongo_pro2_DataExtractedFormDB 
{
	@SuppressWarnings({ "deprecation", "resource" })
	public static void main(String[] args) throws Exception 
	{
		MongoClient mongo = new MongoClient("localhost",27017);
		System.out.println("Connection Established With NoSql DB");
		
		DB db=mongo.getDB("Saurabh");
		System.out.println("Database Created");
		
		DBCollection collection=db.getCollection("Keshari");
		System.out.println("Collection Created");
		
		DBObject bd=collection.findOne();
		System.out.println("Find Basic Object");
		
		
		System.out.println(bd);
		
		System.out.println("Data Printed Sucess");
   
	}
}
