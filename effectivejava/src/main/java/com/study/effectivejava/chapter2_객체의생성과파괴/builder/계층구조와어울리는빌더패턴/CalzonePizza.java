package com.study.effectivejava.chapter2_객체의생성과파괴.builder.계층구조와어울리는빌더패턴;

public class CalzonePizza extends Pizza {
	private final boolean sauceInside;

	public static class Builder extends Pizza.Builder<Builder> {
		private boolean sauceInside = false; // 기본값

		public Builder sourceInside() {
			sauceInside = true;
			return this;
		}

		@Override
		public CalzonePizza build() {
			return new CalzonePizza(this);
		}

		@Override
		protected Builder self() {
			return this;
		}
	}

	CalzonePizza(Builder builder) {
		super(builder);
		this.sauceInside = builder.sauceInside;
	}
}
