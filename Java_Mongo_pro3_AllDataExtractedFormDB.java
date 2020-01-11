package pk1;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class Java_Mongo_pro3_AllDataExtractedFormDB 
{
	public static void main(String[] args) 
	{
		
	MongoClient mongo=new MongoClient("localhost",27017);
	System.out.println("Connection Established With Mongo");
	
	DB db=mongo.getDB("Saurabh");
	System.out.println("Data Base on mongo is created");
	
	DBCollection collection=db.getCollection("Keshari");
	System.out.println("Mongo Database Collection");
   
	DBCursor bd=collection.find();
	System.out.println("Cursur Collected data from Collection");
	
	while(bd.hasNext())
	{
		System.out.println(bd.next());
	}
	
	System.out.println("All Data Printed Success");
	}
}
