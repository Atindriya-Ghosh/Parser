/**
 * 
 */
package org.parser;

import java.util.Map;

/**
 * @author atin
 *
 */
public interface DataInterchangeFileParser {
	
	long getCount(final String response, final String query);
	
	Object getValue(final String response, final String query);
	
	Map<String, String> retrieveNodeKeyMap();

}
