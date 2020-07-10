package com.cities;



import java.math.BigInteger;

import javax.persistence.EntityManager;
import javax.persistence.Query;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CitiesDAO {
	
	@Autowired
	EntityManager em;
	
	public int isConnected(String origin, String destination)
	{
		
		Query query= em.createNativeQuery("select count(*) from cities c where c.origin = ? AND c.destination = ?");
		query.setParameter(1, origin);
		query.setParameter(2, destination);
		
		BigInteger count= (BigInteger) query.getSingleResult();
		return count.intValue();
	}

}
