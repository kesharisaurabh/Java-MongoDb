package pk1;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;

public class Java_Mongo_pro7_DeletingDocument 
{
	public static void main(String[] args) 
	{
		MongoClient mongo=new MongoClient("localhost",27017);
		DB db=mongo.getDB("Student");
		DBCollection col=db.getCollection("classes");
		BasicDBObject obj=new BasicDBObject("rollno",10);
		WriteResult result=col.remove(obj);
		System.out.println("number of documents are created"+result.getN());
		DBCursor cur=col.find();
		while(cur.hasNext())
		{
			System.out.println(cur.next());
		}
	}
}
