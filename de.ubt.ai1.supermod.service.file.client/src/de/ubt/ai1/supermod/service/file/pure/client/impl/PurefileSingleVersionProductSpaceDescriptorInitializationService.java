/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file.pure.client.impl;

import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;
import de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor;
import de.ubt.ai1.supermod.mm.client.SuperModClientFactory;
import de.ubt.ai1.supermod.service.client.ISingleVersionProductDimensionDescriptorInitializationService;
import de.ubt.ai1.supermod.service.client.ISingleVersionProductSpaceDescriptorInitializationService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.file.File;

/**
 * Implementation of the product space descriptor initialization service 
 * specific to a product space which consists of only a versioned file system.
 * It invokes the corresponding {@link 
 * ISingleVersionProductDimensionDescriptorInitializationService} for the 
 * product dimension type {@link de.ubt.ai1.supermod.service.file.File}.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class PurefileSingleVersionProductSpaceDescriptorInitializationService 
implements ISingleVersionProductSpaceDescriptorInitializationService {
	
	@Inject
	@File
	ISingleVersionProductDimensionDescriptorInitializationService 
	fileDimInitService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * ISingleVersionProductSpaceDescriptorInitializationService
	 * #initializeSingleVersionProductSpaceDescriptor(
	 * de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor, 
	 * org.eclipse.emf.ecore.resource.ResourceSet, java.lang.String)
	 */
	@Override
	public SingleVersionProductSpaceDescriptor 
	initializeSingleVersionProductSpaceDescriptor(String rootUri, 
			ResourceSet rs, boolean interactive)
					throws SuperModClientException {
		SingleVersionProductSpaceDescriptor psDesc = SuperModClientFactory
				.eINSTANCE.createSingleVersionProductSpaceDescriptor();
		SingleVersionProductDimensionDescriptor pdDesc = fileDimInitService
				.initializeSingleVersionProductDimensionDescriptor(
						rootUri, rs, interactive);
		psDesc.getDimensionDescriptors().add(pdDesc);
		return psDesc;
	}

}
