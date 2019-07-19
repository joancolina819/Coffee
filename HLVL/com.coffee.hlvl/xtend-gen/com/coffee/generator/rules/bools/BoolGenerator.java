package com.coffee.generator.rules.bools;

import com.coffee.generator.AbstractGenerator;
import com.coffee.generator.Dialect;
import com.coffee.generator.rules.bools.BoolFactory;

@SuppressWarnings("all")
public class BoolGenerator extends AbstractGenerator {
  public BoolGenerator(final String name) {
    super(name, Dialect.BOOL);
    BoolFactory _boolFactory = new BoolFactory();
    this.setFactory(_boolFactory);
  }
}
