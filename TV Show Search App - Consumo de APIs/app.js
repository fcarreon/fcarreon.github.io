const form = document.querySelector('#searchForm');
const results = document.querySelector('.results');

form.addEventListener('submit', async function (e) {
    e.preventDefault();
    const searchTerm = form.elements.query.value;
    const config = { params: { q: searchTerm } };
    const response = await axios.get(`http://api.tvmaze.com/search/shows`, config);
    results.innerHTML = '';
    displayImages(response.data);
    form.elements.query.value = '';
});

const displayImages = (shows) => {
    for (let each of shows) {
        if (each.show.image) { 
            const img = document.createElement('img');
            img.src = each.show.image.medium;
            results.append(img);
        }
    }
}