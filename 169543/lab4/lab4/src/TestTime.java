public class TestTime {
    public static void main(String[] args) {

        Time currentTime = new Time();
        Time otherTime = new Time();
        Time otherOtherTime;

        currentTime.hours = 12;
        currentTime.minutes = 31;

        otherTime.hours = 13;
        otherTime.minutes = 30;

        otherOtherTime = currentTime.addTime(otherTime);

        System.out.println(otherOtherTime.hours+":"+ otherOtherTime.minutes);
    }
}


class Time{
    int hours;
    int minutes;

    Time addTime(Time otherTime){
        Time newTime = new Time();
        newTime.minutes = otherTime.minutes + this.minutes;
        newTime.hours = otherTime.hours + this.hours;
        if(newTime.minutes > 59){
            newTime.minutes %= 60;
            newTime.hours++;
        }
        if(newTime.hours >=24) {
            newTime.hours = newTime.hours % 24;
        }
        return newTime;
    }
}
