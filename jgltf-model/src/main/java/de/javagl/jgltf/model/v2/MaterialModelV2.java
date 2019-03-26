/*
 * www.javagl.de - JglTF
 *
 * Copyright 2015-2017 Marco Hutter - http://www.javagl.de
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */
package de.javagl.jgltf.model.v2;

import de.javagl.jgltf.impl.v2.Material;
import de.javagl.jgltf.model.MaterialModel;
import de.javagl.jgltf.model.TextureModel;
import de.javagl.jgltf.model.impl.AbstractNamedModelElement;

/**
 * Implementation of a {@link MaterialModel} for glTF 2.0
 */
public final class MaterialModelV2 extends AbstractNamedModelElement
    implements MaterialModel
{
    /**
     * The actual material object
     */
    private Material material;
    
    /**
     * The base color factor
     */
    private float[] baseColorFactor;
    
    /**
     * The base color texture
     */
    private TextureModel baseColorTexture;
    
    /**
     * The metallic factor
     */
    private float metallicFactor;
    
    /**
     * The roughness factor
     */
    private float roughnessFactor;
    
    /**
     * The metallic-roughness texture
     */
    private TextureModel metallicRoughnessTexture;
    
    /**
     * The normal texture
     */
    private TextureModel normalTexture;
    
    /**
     * The normal scale
     */
    private float normalScale;

    /**
     * The occlusion texture
     */
    private TextureModel occlusionTexture;
    
    /**
     * The occlusion strength
     */
    private float occlusionStrength;
    
    /**
     * The emissive texture
     */
    private TextureModel emissiveTexture;
    
    /**
     * The emissive factor
     */
    private float[] emissiveFactor;

    /**
     * The alpha mode
     */
    private String alphaMode;
    
    /**
     * The alpha cutoff
     */
    private float alphaCutoff;
    
    /**
     * Whether the material is double sided
     */
    private boolean doubleSided;
    
    
    /**
     * Creates a new instance with default values
     */
    public MaterialModelV2()
    {
        baseColorFactor = new float[]{ 1.0f, 1.0f, 1.0f, 1.0f };
        baseColorTexture = null;
        
        metallicFactor = 1.0f;
        roughnessFactor = 1.0f;
        metallicRoughnessTexture = null;
        
        normalScale = 1.0f;
        normalTexture = null;
        
        occlusionTexture = null;
        occlusionStrength = 1.0f;
        
        emissiveTexture = null;
        emissiveFactor = new float[]{0.0f, 0.0f, 0.0f };

        alphaMode = "OPAQUE";
        alphaCutoff = 0.5f;
        
        doubleSided = false;
    }
    
    /**
     * Set the actual material object
     * 
     * @param material The material
     */
    public void setMaterial(Material material)
    {
        this.material = material;
    }
    
    @Override
    public Material getMaterial()
    {
        return material;
    }

    /**
     * Returns the base color factor
     * 
     * @return The base color factor
     */
    public float[] getBaseColorFactor()
    {
        return baseColorFactor;
    }

    /**
     * Set the base color factor
     * 
     * @param baseColorFactor The base color factor
     */
    public void setBaseColorFactor(float[] baseColorFactor)
    {
        this.baseColorFactor = baseColorFactor;
    }

    /**
     * Returns the base color texture
     * 
     * @return The base color texture
     */
    public TextureModel getBaseColorTexture()
    {
        return baseColorTexture;
    }

    /**
     * Set the base color texture
     * 
     * @param baseColorTexture The base color texture
     */
    public void setBaseColorTexture(TextureModel baseColorTexture)
    {
        this.baseColorTexture = baseColorTexture;
    }

    /**
     * Returns the metallic factor
     * 
     * @return The metallic factor
     */
    public float getMetallicFactor()
    {
        return metallicFactor;
    }

    /**
     * Set the metallic factor
     * 
     * @param metallicFactor The metallic factor
     */
    public void setMetallicFactor(float metallicFactor)
    {
        this.metallicFactor = metallicFactor;
    }

    /**
     * Returns the roughness factor
     * 
     * @return The roughness factor
     */
    public float getRoughnessFactor()
    {
        return roughnessFactor;
    }

    /**
     * Set the roughness factor
     * 
     * @param roughnessFactor The roughness factor
     */
    public void setRoughnessFactor(float roughnessFactor)
    {
        this.roughnessFactor = roughnessFactor;
    }

    /**
     * Returns the metallic-roughness-texture
     * 
     * @return The metallic-roughness texture
     */
    public TextureModel getMetallicRoughnessTexture()
    {
        return metallicRoughnessTexture;
    }

    /**
     * Set the metallic-roughness-texture
     * 
     * @param metallicRoughnessTexture The metallic-roughness-texture
     */
    public void setMetallicRoughnessTexture(TextureModel metallicRoughnessTexture)
    {
        this.metallicRoughnessTexture = metallicRoughnessTexture;
    }

    /**
     * Returns the normal texture
     * 
     * @return The normal texture
     */
    public TextureModel getNormalTexture()
    {
        return normalTexture;
    }

    /**
     * Set the normal texture
     * 
     * @param normalTexture The normal texture
     */
    public void setNormalTexture(TextureModel normalTexture)
    {
        this.normalTexture = normalTexture;
    }

    /**
     * Returns the normal scale
     * 
     * @return The normal scale
     */
    public float getNormalScale()
    {
        return normalScale;
    }

    /**
     * Set the normal scale
     * 
     * @param normalScale The normal scale
     */
    public void setNormalScale(float normalScale)
    {
        this.normalScale = normalScale;
    }
    
    /**
     * Returns the occlusion texture
     * 
     * @return The occlusion texture
     */
    public TextureModel getOcclusionTexture()
    {
        return occlusionTexture;
    }

    /**
     * Set the occlusion texture
     * 
     * @param occlusionTexture The occlusion texture
     */
    public void setOcclusionTexture(TextureModel occlusionTexture)
    {
        this.occlusionTexture = occlusionTexture;
    }

    /**
     * Returns the occlusion strength
     * 
     * @return The occlusion strength
     */
    public float getOcclusionStrength()
    {
        return occlusionStrength;
    }

    /**
     * Set the occlusion strength
     * 
     * @param occlusionStrength The occlusion strength
     */
    public void setOcclusionStrength(float occlusionStrength)
    {
        this.occlusionStrength = occlusionStrength;
    }

    /**
     * Returns the emissive texture
     * 
     * @return The emissive texture
     */
    public TextureModel getEmissiveTexture()
    {
        return emissiveTexture;
    }

    /**
     * Set the emissive texture
     * 
     * @param emissiveTexture The emissive texture
     */
    public void setEmissiveTexture(TextureModel emissiveTexture)
    {
        this.emissiveTexture = emissiveTexture;
    }
    
    /**
     * Returns the emissive factor
     * 
     * @return The emissive factor
     */
    public float[] getEmissiveFactor()
    {
        return emissiveFactor;
    }

    /**
     * Set the emissive factor
     * 
     * @param emissiveFactor The emissive factor
     */
    public void setEmissiveFactor(float[] emissiveFactor)
    {
        this.emissiveFactor = emissiveFactor;
    }

    /**
     * Returns the alpha mode
     * 
     * @return The alpha mode
     */
    public String getAlphaMode()
    {
        return alphaMode;
    }

    /**
     * Set the alpha mode
     * 
     * @param alphaMode The alpha mode
     */
    public void setAlphaMode(String alphaMode)
    {
        this.alphaMode = alphaMode;
    }

    /**
     * Returns the alpha cutoff
     * 
     * @return The alpha cutoff
     */
    public float getAlphaCutoff()
    {
        return alphaCutoff;
    }

    /**
     * Set the alpha cutoff
     * 
     * @param alphaCutoff The alpha cutoff
     */
    public void setAlphaCutoff(float alphaCutoff)
    {
        this.alphaCutoff = alphaCutoff;
    }

    /**
     * Returns whether the material is double sided
     * 
     * @return Whether the material is double sided
     */
    public boolean isDoubleSided()
    {
        return doubleSided;
    }

    /**
     * Set whether the material is double sided
     * 
     * @param doubleSided Whether the material is double sided
     */
    public void setDoubleSided(boolean doubleSided)
    {
        this.doubleSided = doubleSided;
    }
}
