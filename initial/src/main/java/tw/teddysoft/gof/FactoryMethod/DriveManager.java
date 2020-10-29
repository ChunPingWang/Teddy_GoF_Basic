/*
 * Copyright 2016 TeddySoft Technology. All rights reserved.
 * 
 */
package tw.teddysoft.gof.FactoryMethod;

public class DriveManager {
	
	Drive getDrive(String type, int index){
		Drive drive = SimpleDriveFactory.createDrive(type, index);
		drive.updateFreeSpace();
		drive.doQuickSMARTCheck();
		return drive;
	}
}
