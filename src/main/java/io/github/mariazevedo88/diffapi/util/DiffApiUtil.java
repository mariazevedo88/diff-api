package io.github.mariazevedo88.diffapi.util;

import org.springframework.util.Base64Utils;

public class DiffApiUtil {
	
	private static final String BASE64RGX = "^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)?$";
	
	/**
	 * Field to represent API version on the requests/responses header
	 */
	public static final String DIFF_API_VERSION_HEADER = "diffapi-version";
	
	private DiffApiUtil() {}
	
	public static String encodeToBase64(byte[] stringInBytes) {
		return Base64Utils.encodeToString(stringInBytes);
	}
	
	public static boolean isEncodedBase64(String stringToBeChecked) {
		return stringToBeChecked.matches(BASE64RGX);
	}

}
