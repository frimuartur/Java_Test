public class AreaPatratului {
    double areaPatratului (double lungimeaArculuiCircular) {
        double razaCercului = (lungimeaArculuiCircular*4)/(2*3.14);
        double areaPatratului = razaCercului * razaCercului;
        return areaPatratului;
    }
}
