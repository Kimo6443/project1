package org.testing.utilities;
//method for capturing logs

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class logsCapture
{
public static void takelogs(String classname,String message)
{
	DOMConfigurator.configure("../htdf/LogsLayout.xml");
	Logger l=Logger.getLogger(classname);
	l.info(message);
	}
}
