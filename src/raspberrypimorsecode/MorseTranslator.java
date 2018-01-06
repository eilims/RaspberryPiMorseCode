/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raspberrypimorsecode;

import com.pi4j.io.gpio.GpioPinDigitalOutput;
import java.util.HashMap;

/**
 *
 * @author P34Gv2
 */
public class MorseTranslator {

    final static int longPause = 180;
    final static int shortPause = 60;

    public static void LongPause(int number, GpioPinDigitalOutput pin) throws InterruptedException {
        pin.high();
        Thread.sleep(longPause);
        pin.low();
        Thread.sleep(shortPause);
    }

    public static void ShortPause(int number, GpioPinDigitalOutput pin) throws InterruptedException {
        pin.high();
        Thread.sleep(shortPause);
        pin.low();
        Thread.sleep(shortPause);
    }

    public void timing() {
    }

    public enum LetterTiming {

        LetterA {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        ShortPause(longPause, pin);
                        LongPause(longPause, pin);
                    }
                }, LetterB {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        LongPause(longPause, pin);
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                    }
                }, LetterC {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        LongPause(longPause, pin);
                        ShortPause(longPause, pin);
                        LongPause(longPause, pin);
                        ShortPause(longPause, pin);
                    }
                }, LetterD {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        LongPause(longPause, pin);
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                    }
                }, LetterE {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        ShortPause(longPause, pin);
                    }
                }, LetterF {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                        LongPause(longPause, pin);
                        ShortPause(longPause, pin);
                    }
                }, LetterG {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        ShortPause(longPause, pin);
                    }
                }, LetterH {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                    }
                }, LetterI {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                    }
                }, LetterJ {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        ShortPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                    }
                }, LetterK {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        LongPause(longPause, pin);
                        ShortPause(longPause, pin);
                        LongPause(longPause, pin);
                    }
                }, LetterL {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        ShortPause(longPause, pin);
                        LongPause(longPause, pin);
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                    }
                }, LetterM {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                    }
                }, LetterN {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        LongPause(longPause, pin);
                        ShortPause(longPause, pin);
                    }
                }, LetterO {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                    }
                }, LetterP {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        ShortPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        ShortPause(longPause, pin);
                    }
                }, LetterQ {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        ShortPause(longPause, pin);
                        LongPause(longPause, pin);
                    }
                }, LetterR {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        ShortPause(longPause, pin);
                        LongPause(longPause, pin);
                        ShortPause(longPause, pin);
                    }
                }, LetterS {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                    }
                }, LetterT {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        LongPause(longPause, pin);
                    }
                }, LetterU {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                        LongPause(longPause, pin);
                    }
                }, LetterV {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                        LongPause(longPause, pin);
                    }
                }, LetterW {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        ShortPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                    }
                }, LetterX {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        LongPause(longPause, pin);
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                        LongPause(longPause, pin);
                    }
                }, LetterY {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        LongPause(longPause, pin);
                        ShortPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                    }
                }, LetterZ {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                    }
                }, One {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        ShortPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                    }
                }, Two {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                    }
                }, Three {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                    }
                }, Four {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                        LongPause(longPause, pin);
                    }
                }, Five {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                    }
                }, Six {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        LongPause(longPause, pin);
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                    }
                }, Seven {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                    }
                }, Eight {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                    }
                }, Nine {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        ShortPause(longPause, pin);
                    }
                }, Zero {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                    }
                }, Comma {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        ShortPause(longPause, pin);
                        ShortPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                    }
                }, FullStop {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        ShortPause(longPause, pin);
                        LongPause(longPause, pin);
                        ShortPause(longPause, pin);
                        LongPause(longPause, pin);
                        ShortPause(longPause, pin);
                        LongPause(longPause, pin);
                    }
                }, Space {
                    public void timing(GpioPinDigitalOutput pin) throws InterruptedException {
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                        LongPause(longPause, pin);
                    }
                };

        public abstract void timing(GpioPinDigitalOutput pin) throws InterruptedException;
    }

    public static HashMap MorseLetterMap() {
        HashMap<Character, LetterTiming> map = new HashMap<>();
        LetterTiming[] letterArray = LetterTiming.values();
        int number = 0;
        for (char a = 'a'; a <= 'z'; a++) {
            map.put(a, letterArray[number]);
            number++;
        }
        for (char a = '1'; a <= '9'; a++) {
            map.put(a, letterArray[number]);
            number++;
        }
        map.put(',', LetterTiming.Comma);
        map.put(' ', LetterTiming.Space);
        return map;
    }

    public static void OutputTranslator(char[] letterArray, GpioPinDigitalOutput pin) throws InterruptedException {
        HashMap<Character, LetterTiming> map = MorseLetterMap();
        for (int i = 0; i < letterArray.length; i++) {
            map.get(letterArray[i]).timing(pin);
            System.out.println(letterArray[i]);
            LetterTiming.FullStop.timing(pin);
        }
    }
}
