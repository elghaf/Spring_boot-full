package bridge.vehicle;

import bridge.accelerator.AccelerationMechanism;

public abstract class Vehicle {
    protected AccelerationMechanism myAccelerator;

    /*Constructor 
     * @Param: myAccelerator Given acceleration mechanism
    */
    Vehicle(AccelerationMechanism myAccelerator){
        this.myAccelerator = myAccelerator;
    }
    /*
     * Definitely self explanatory!
     */
    public void move(){
        System.out.println("moving!");
        myAccelerator.accelerate();
        System.out.println();
    }

}
