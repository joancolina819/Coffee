package com.coffee.generator.rules.att;

import com.coffee.generator.AbstractGenerator;
import com.coffee.generator.Dialect;
import com.coffee.generator.TransformationRules;
import com.coffee.generator.rules.att.AttFactory;

@SuppressWarnings("all")
public class AttGenerator extends AbstractGenerator {
  public AttGenerator(final String name, final Dialect dialect) {
    super(name, dialect);
    final TransformationRules factory = new AttFactory();
    this.setFactory(factory);
  }
}
