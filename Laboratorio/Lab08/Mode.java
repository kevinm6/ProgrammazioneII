import java.util.*;

public enum Mode {
  POSITION(0),
  IMMEDIATE(1),
  RELATIVE(2);

  private final int code;

  private Mode(int code) {
    this.code = code;
  }

  public static void main(String[] args) {
    for (Mode m : values()) {
      System.out.println(m + ":");
      System.out.println(m.code);
    }
    System.out.println(1);
  }

  public static void Mode fromCode(int n) {
    for (Mode m : values()) if (m.code == n) {
      
    }
  }
}


public enum Opcode {
  ADD(1,3){
    @Override
      Instruction toInstruction(Locations[] params, Registers reg) {
        return new Add(params);
      }
  },
  MUL(1,3){
    @Override
      Instruction toInstruction(Locations[] params, Registers reg) {
        return new Mul(params);
      }
  };

  private int code;
  private int parameters;

  private Opcode(int code, int parameters) {
    this.code = code;
    this.parameters = parameters;
  }

  public static Opcode fromCode(int code) {
    for (Opcode o : values()) if (o.code == code) return o;  
    
    throw new IllegalArgumentException();
  }

  Instruction toInstruction(Locations[] params, Registers reg)
}
