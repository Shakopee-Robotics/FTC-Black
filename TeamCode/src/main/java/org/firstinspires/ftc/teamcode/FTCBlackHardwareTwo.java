package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by nmckelvey on 11/8/17.
 */

public class FTCBlackHardwareTwo {
    /* Public OpMode members. */
    public DcMotor frontLeftMotor   = null;
    public DcMotor frontRightMotor  = null;
    public DcMotor rearLeftMotor   = null;
    public DcMotor rearRightMotor  = null;
    public DcMotor winch  = null;
    public Servo leftClaw = null;
    public Servo rightClaw = null;
    public static final double MID_SERVO       =  0.0 ;

    /* local OpMode members. */
    HardwareMap hwMap           =  null;
    private ElapsedTime period  = new ElapsedTime();

    /* Constructor */
    public FTCBlackHardwareTwo(){

    }

    /* Initialize standard Hardware interfaces */
    public void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;

        // Define and Initialize Motors
        frontLeftMotor   = hwMap.get(DcMotor.class,"fleft");
        frontRightMotor  = hwMap.get(DcMotor.class,"fright");
        rearLeftMotor   = hwMap.get(DcMotor.class,"rleft");
        rearRightMotor  = hwMap.get(DcMotor.class,"rright");
        winch    = hwMap.get(DcMotor.class,"win");

        frontLeftMotor.setDirection(DcMotor.Direction.REVERSE); // Set to REVERSE if using AndyMark motors
        frontRightMotor.setDirection(DcMotor.Direction.FORWARD);
        rearLeftMotor.setDirection(DcMotor.Direction.REVERSE); // Set to REVERSE if using AndyMark motors
        rearRightMotor.setDirection(DcMotor.Direction.FORWARD);// Set to FORWARD if using AndyMark motors
        winch.setDirection(DcMotor.Direction.FORWARD);

        /*Old motor settings
        frontLeftMotor.setDirection(DcMotor.Direction.FORWARD); // Set to REVERSE if using AndyMark motors
        frontRightMotor.setDirection(DcMotor.Direction.REVERSE);
        rearLeftMotor.setDirection(DcMotor.Direction.FORWARD); // Set to REVERSE if using AndyMark motors
        rearRightMotor.setDirection(DcMotor.Direction.REVERSE);// Set to FORWARD if using AndyMark motors
        */
        // Set all motors to zero power
        frontLeftMotor.setPower(0);
        frontRightMotor.setPower(0);
        rearLeftMotor.setPower(0);
        rearRightMotor.setPower(0);
        winch.setPower(0);
        // Set all motors to run without encoders.
        // May want to use RUN_USING_ENCODERS if encoders are installed.
        frontLeftMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        frontRightMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rearLeftMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rearRightMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        winch.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);


        leftClaw  = hwMap.get(Servo.class, "gleft");
        rightClaw = hwMap.get(Servo.class, "gright");
        leftClaw.setPosition(.6);
        rightClaw.setPosition(0);
        // Define and initialize ALL installed servos.


    }



}




