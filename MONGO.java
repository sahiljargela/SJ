class demo{
	public static void main(String args[]){
		MongoClientURI uri = new MongoClientURI(
   "mongodb://kay:myRealPassword@mycluster0-shard-00-00-wpeiv.mongodb.net:27017,mycluster0-shard-00-01-wpeiv.mongodb.net:27017,mycluster0-shard-00-02-wpeiv.mongodb.net:27017/admin?ssl=true&replicaSet=Mycluster0-shard-0&authSource=admin");

MongoClient mongoClient = new MongoClient(uri);
MongoDatabase database = mongoClient.getDatabase("test");
	}
}