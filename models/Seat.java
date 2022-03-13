public class Seat extends BaseModel {
    private int rowNo;
    private int seatNo;
    private SeatStatus seatStatus;

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }
    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }
    public int getRowNo() {
        return rowNo;
    }
    public void setRowNo(int rowNo) {
        this.rowNo = rowNo;
    }
    public int getSeatNo() {
        return seatNo;
    }
    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public boolean isValidSeat(){
        return this.seatStatus != SeatStatus.PATHWAY;
    }

}

 
