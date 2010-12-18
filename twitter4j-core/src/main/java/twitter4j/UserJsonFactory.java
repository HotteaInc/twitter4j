package twitter4j;

import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

public class UserJsonFactory {

	public static User getUser(String string) throws TwitterException, JSONException
	{
		return new UserJSONImpl(new JSONObject(string));
	}

	public static String getJSONString(User user)
	{
		if(user == null || !(user instanceof UserJSONImpl))
			return null;

		return ((UserJSONImpl)user).jsonString;
	}

}
