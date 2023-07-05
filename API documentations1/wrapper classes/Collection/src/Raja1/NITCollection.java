package Raja1;

public class NITCollection {
	private Object[] elementData;
	private int elementCount;

	public NITCollection() {
    	elementData=new Object[10];
    	elementCount=0;
	}
    	public void add(Object obj){
    		
    		if(size()==capacity()) {
    			grow();
    			elementData[elementCount]=0;
    			elementCount++;
   
    		}
    	}
    		
    		
    		private void grow() {
    			Object [] nextArray=new Object[capacity()*2];
    			for(int i=0;i<elementData.length;i++) {
    				nextArray[i]=elementData[i];
    				
    				
    		}
    			elementData=nextArray;
    	}
    		
    		public int capacity() {
    			return elementData.length;
    		}
    		
    		public int size() {
    			return elementCount;
    		}
    		
    	
    		
    	
    }
