/* Do not edit this file. */

import java.lang.IllegalStateException;

public class EmptyException extends IllegalStateException
{
    public static final long serialVersionUID = 1L;
    
	public EmptyException()
	{
		super("It is empty.");
	}
}