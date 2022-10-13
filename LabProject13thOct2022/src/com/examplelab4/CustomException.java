/*labQues4: Create a cutom exception (Name cannot be null). The user will enter student details , 
 * it will throw an exception if the name or id id null
 * author:Sweta Das
 * DATE: 13.10.22
 */
//declaring package
package com.examplelab4;

//declaring class CustomException
public class CustomException extends NullPointerException {

	private static final long serialVersionUID = 1L;

	CustomException(String message) {
		super(message);

	}

}
//end of class CustomException
