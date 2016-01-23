package exer;

public class ConnectionProvider {

    private static ConnectionProvider  Instance = null;

    public static ConnectionProvider  getIntance() {
          if (Instance == null){
        	  synchronized(ConnectionProvider.class) {
        	      if (Instance == null)          
        	    	  Instance = new ConnectionProvider();  
        	    }
        	  Instance = new ConnectionProvider();
          }
              
          return Instance;
    }
}
