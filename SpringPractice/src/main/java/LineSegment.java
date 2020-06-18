/**
 * <b>Description</b> :
 *
 * @author Vinod Akkepalli
 */
public class LineSegment {

    private Point start;
    private Point end;

    public LineSegment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "LineSegment{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
