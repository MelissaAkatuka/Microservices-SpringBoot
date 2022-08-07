package br.com.erudio.controller;

import br.com.erudio.math.CalculateMath;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.erudio.converter.NumberConverter;

@RestController
public class MathController {

    private CalculateMath calculateMath = new CalculateMath();

    @RequestMapping(value="/sum/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo){
        if(!NumberConverter.isNumeric(numberOne)||!NumberConverter.isNumeric(numberTwo)){
                throw new UnsupportedOperationException("Please set numeric value");
        }
        return calculateMath.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value="/subtraction/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo){
        if(!NumberConverter.isNumeric(numberOne)||!NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedOperationException("Please set numeric value");
        }
        return calculateMath.subtraction(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value="/multiplication/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo){
        if(!NumberConverter.isNumeric(numberOne)||!NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedOperationException("Please set numeric value");
        }
        return calculateMath.multiplication(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value="/division/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo){
        if(!NumberConverter.isNumeric(numberOne)||!NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedOperationException("Please set numeric value");
        }
        return calculateMath.division(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value="/mean/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double mean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo){
        if(!NumberConverter.isNumeric(numberOne)||!NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedOperationException("Please set numeric value");
        }
        return calculateMath.mean(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value="/squareRoot/{number}", method= RequestMethod.GET)
    public Double squareRoot(@PathVariable("number") String number){
        if(!NumberConverter.isNumeric(number)){
            throw new UnsupportedOperationException("Please set numeric value");
        }
        return calculateMath.squareRoot(NumberConverter.convertToDouble(number));
    }

}


