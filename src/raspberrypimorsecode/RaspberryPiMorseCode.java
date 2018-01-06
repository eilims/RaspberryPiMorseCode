/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raspberrypimorsecode;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import java.util.Scanner;

/**
 *
 * @author P34Gv2
 */
public class RaspberryPiMorseCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        final GpioController gpio = GpioFactory.getInstance();
        final GpioPinDigitalOutput pin1 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "LED-1", PinState.LOW);
        pin1.setShutdownOptions(true, PinState.LOW);
        pin1.low();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a statement and watch it be flashed!");
        String sentence = reader.nextLine();
        sentence = sentence.toLowerCase();
        char[] charArray = sentence.toCharArray();
        MorseTranslator.OutputTranslator(charArray, pin1);
        gpio.shutdown();
    }
    
}
