package pl.oop1;

public class Phone {
	private String make;
	private String type;
	private Double screenDiagonal;

	// default constructor
	public Phone() {
	}

	public Phone(String make, String type, Double screenDiagonal) {
		this.make = make;
		this.type = type;
		this.screenDiagonal = screenDiagonal;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getScreenDiagonal() {
		return screenDiagonal;
	}

	public void setScreenDiagonal(Double screenDiagonal) {
		this.screenDiagonal = screenDiagonal;
	}

	@Override
	public String toString() {
		return "Phone [make=" + make + ", type=" + type + ", screenDiagonal="
				+ screenDiagonal + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result
				+ ((screenDiagonal == null) ? 0 : screenDiagonal.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (screenDiagonal == null) {
			if (other.screenDiagonal != null)
				return false;
		} else if (!screenDiagonal.equals(other.screenDiagonal))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
}
