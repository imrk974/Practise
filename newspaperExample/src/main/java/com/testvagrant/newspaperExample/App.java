package com.testvagrant.newspaperExample;

import java.util.ArrayList;
import java.util.List;

import com.testvagrant.Subscription.Subscriptionrate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	Subscriptionrate rate = new Subscriptionrate();
    	List<String> papers = new ArrayList<String>();
    	papers.add("BM");
    	papers.add("HT");
    	papers.add("RK");
     	System.out.println(rate.finalSubscriptionChargeForAllPapers(papers));
    }
}
