package clone.timesheet;

import java.time.LocalDateTime;

public class TimeSheetItem {
    private String employee;
    private String project;
    private LocalDateTime from;
    private LocalDateTime to;

    public TimeSheetItem(String employee, String project, LocalDateTime from, LocalDateTime to) {
        this.employee = employee;
        this.project = project;
        this.from = from;
        this.to = to;
    }

    public TimeSheetItem(TimeSheetItem o) {
        this.employee = o.employee;
        this.project = o.project;
        this.from = o.from;
        this.to = o.to;
    }

    public TimeSheetItem copyWithDifferentEmployee(TimeSheetItem timeSheetItem, String newEmployee) {
        TimeSheetItem tst = new TimeSheetItem(timeSheetItem);
        tst.employee = newEmployee;
        return tst;
    }
}
