package ObjectCachePackage;
import java.util.*;

public class ObjectCache
{
	int maxCapacity;
	class HashStructure
	{
		Object value;
		Long timeStamp;
		HashStructure(Object val)
		{
			this.value=val;
		}
	}

	ObjectCache(int cacheCapacity)
	{
		maxCapacity=cacheCapacity;
	}

	Hashtable<Object,HashStructure> h=new Hashtable<Object,HashStructure>();
	public void putCache(Object k,Object v)
	{
		int currentCapacity=h.size();
		if(currentCapacity < maxCapacity)
		{
			HashStructure hs=new HashStructure(v);
			hs.timeStamp=System.currentTimeMillis();
			h.put(k,hs);	
			System.out.println("Stored successfully");
		}
		else
		{
			System.out.println("Cache full......LRU");
			Object LRUKey=LRUreplacement();
			h.remove(LRUKey);
			HashStructure hs=new HashStructure(v);
			hs.timeStamp=System.currentTimeMillis();
			h.put(k,hs);			
		}
	}
	public Object LRUreplacement()
	{
		Object minKey= null;
		long minValue= Long.MAX_VALUE;
		for(Map.Entry<Object,HashStructure> x: h.entrySet())
		{
			HashStructure hs=x.getValue();
			if(hs.timeStamp < minValue)
			{
	            minValue= hs.timeStamp;
	            minKey= x.getKey();
			}
		}
		return minKey;
	}

	public Object getCache(Object k)
	{
		if(h.containsKey(k))
		{
			HashStructure hs=h.get(k);
			hs.timeStamp=System.currentTimeMillis();
			return hs.value;				
		}
		else
			return null;
	}

}
