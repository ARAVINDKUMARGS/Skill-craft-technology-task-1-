def convert_temperature(value, scale_from, scale_to):
    if scale_from == scale_to:
        return value
    if scale_from == "Celsius":
        if scale_to == "Fahrenheit":
            return (value * 9/5) + 32
        elif scale_to == "Kelvin":
            return value + 273.15
    elif scale_from == "Fahrenheit":
        if scale_to == "Celsius":
            return (value - 32) * 5/9
        elif scale_to == "Kelvin":
            return (value - 32) * 5/9 + 273.15
    elif scale_from == "Kelvin":
        if scale_to == "Celsius":
            return value - 273.15
        elif scale_to == "Fahrenheit":
            return (value - 273.15) * 9/5 + 32


temp = float(input("Enter the temperature value: "))
from_scale = input("From (Celsius/Fahrenheit/Kelvin): ")
to_scale = input("To (Celsius/Fahrenheit/Kelvin): ")
result = convert_temperature(temp, from_scale, to_scale)
print(f"{temp}° {from_scale} = {result:.2f}° {to_scale}")
