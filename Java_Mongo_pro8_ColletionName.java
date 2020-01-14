package pk1;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;

public class Java_Mongo_pro8_ColletionName 
{
	public static void main(String[] args) 
	{
		MongoClient mongo=new MongoClient("localhost",27017);
		DB db=mongo.getDB("Student");
		for(String col:db.getCollectionNames())
		{
			System.out.println(col);
		}
	}
}
