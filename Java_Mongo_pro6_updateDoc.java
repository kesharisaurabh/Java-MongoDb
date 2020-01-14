package pk1;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;

public class Java_Mongo_pro6_updateDoc 
{
	public static void main(String[] args) 
	{
		MongoClient mongo=new MongoClient("localhost",27017);
		DB db=mongo.getDB("Student");
		DBCollection coll=db.getCollection("classes");
		DBObject query=new BasicDBObject("rollno", 21);
		DBObject update=new BasicDBObject();
		update.put("$set",new BasicDBObject("stdid",21));
		
		WriteResult ws=coll.update(query, update);
		System.out.println(ws);
		DBCursor cur=coll.find();
		while(cur.hasNext()) {
			System.out.println(cur.next());
		}
		
		
	}
}
