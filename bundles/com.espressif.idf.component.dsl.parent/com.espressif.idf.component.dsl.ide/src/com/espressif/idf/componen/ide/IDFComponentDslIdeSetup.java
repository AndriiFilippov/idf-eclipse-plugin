/*
 * generated by Xtext 2.28.0
 */
package com.espressif.idf.componen.ide;

import com.espressif.idf.componen.IDFComponentDslRuntimeModule;
import com.espressif.idf.componen.IDFComponentDslStandaloneSetup;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class IDFComponentDslIdeSetup extends IDFComponentDslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new IDFComponentDslRuntimeModule(), new IDFComponentDslIdeModule()));
	}
	
}
