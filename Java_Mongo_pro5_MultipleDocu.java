package pk1;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class Java_Mongo_pro5_MultipleDocu 
{
	public static void main(String[] args) 
	{
		MongoClient mongo=new MongoClient("localhost",27017);
		DB db=mongo.getDB("Student");
		DBCollection coll=db.getCollection("classes");
		BasicDBObject obj=new BasicDBObject("rollno",new BasicDBObject("$gt",1));
		DBCursor cur=coll.find();
		cur=coll.find(obj);
		while(cur.hasNext())
		{
			System.out.println(cur.next());
		}
		
		
	}
}
