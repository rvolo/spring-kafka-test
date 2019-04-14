package com.kafka;

public class TestObj {
	private long id;
	private long var1;
	private long var2;
	private long var3;

	public TestObj() {
	}

	public TestObj(long id, long var1, long var2, long var3) {
		this.id = id;
		this.var1 = var1;
		this.var2 = var2;
		this.var3 = var3;
	}

	public long getId() {
		return id;
	}

	public TestObj setId(long id) {
		this.id = id;
		return this;
	}

	public long getVar1() {
		return var1;
	}

	public TestObj setVar1(long var1) {
		this.var1 = var1;
		return this;
	}

	public long getVar2() {
		return var2;
	}

	public TestObj setVar2(long var2) {
		this.var2 = var2;
		return this;
	}

	public long getVar3() {
		return var3;
	}

	public TestObj setVar3(long var3) {
		this.var3 = var3;
		return this;
	}

	@Override
	public String toString() {
		return "TestObj{" +
				"id=" + id +
				", var1=" + var1 +
				", var2=" + var2 +
				", var3=" + var3 +
				'}';
	}
}
