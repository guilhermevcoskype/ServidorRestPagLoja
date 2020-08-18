package servidor.model;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

public class DadosPagamento {

	@NotNull(message="O valor não pode ser nulo")
	private BigDecimal value;

	public DadosPagamento(BigDecimal value) {
		this.value = value;
	}

	public DadosPagamento() {
	}

	public BigDecimal getValue() {
		return value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		DadosPagamento other = (DadosPagamento) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

}
