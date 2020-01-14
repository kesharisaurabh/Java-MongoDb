package pk1;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;

public class Java_Mongo_pro10_noOf_DB_present 
{
	public static void main(String[] args) 
	{
		MongoClient mongo=new MongoClient();
		System.out.println(mongo.getDatabaseNames());
	}
}
